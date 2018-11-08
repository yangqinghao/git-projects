package com.ztesoft.threadPool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author Created by yangqinghao
 * @Date 2018/10/16 11:02
 * @Version
 * @Description 实现商品信息和多个图片同时加载
 */
public class DisplayProductInfoByCompletionService {

    private static class ProductInfo{

        private ProductImgeInfo imgeInfo;

        public void setProductImgeInfo(ProductImgeInfo info) {
                this.imgeInfo = info;
        }

        public ProductImgeInfo getImgeInfo(){
            return imgeInfo;
        }
    }

    private static class ProductImgeInfo{

        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public ProductImgeInfo(String name){
            this.name = name;
        }

    }
    //创建线程池
    private final ExecutorService executorService;
    //格式化日期
    private final DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public DisplayProductInfoByCompletionService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public void renderProductDetail(){
        final List<ProductInfo> productInfos = loadProductInfos();
        CompletionService<ProductImgeInfo> completionService = new ExecutorCompletionService<ProductImgeInfo>(executorService);
        //为每一个图片下载建立一个任务
        for (final ProductInfo productInfo:productInfos){
            completionService.submit(new Callable<ProductImgeInfo>() {
                @Override
                public ProductImgeInfo call() throws Exception {
                    System.out.println("建立下载任务");
                    return productInfo.getImgeInfo();
                }
            });
        }
        //展示商品信息
        rederProductInformation(productInfos);

        //显示图片信息
        try {
            for(int i = 0;i<productInfos.size();i++) {
                Future<ProductImgeInfo> future = completionService.take();
                ProductImgeInfo productImgeInfo = future.get();
                rederProductImge(productImgeInfo);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void rederProductImge(ProductImgeInfo productImgeInfo) {
        try {
            Thread.sleep(5);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " display products images! "
                + dateFormat.format(new Date())+productImgeInfo.getName());
    }

    private void rederProductInformation(List<ProductInfo> productInfos) {
        for (ProductInfo productInfo:productInfos){
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " display products description! "
                + dateFormat.format(new Date()));
    }

    private List<ProductInfo> loadProductInfos() {
        List<ProductInfo> productInfoList = new ArrayList<>();
        try {
            TimeUnit.SECONDS.sleep(6);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductImgeInfo(new ProductImgeInfo("imge1"));
        ProductInfo productInfo1 = new ProductInfo();
        productInfo1.setProductImgeInfo(new ProductImgeInfo("imge2"));
        productInfoList.add(productInfo);
        productInfoList.add(productInfo1);
        System.out.println(Thread.currentThread().getName() + " load products info! "
                + dateFormat.format(new Date()));
        return productInfoList;
    }
    
    public static void main(String [] args){
           DisplayProductInfoByCompletionService service = new DisplayProductInfoByCompletionService(Executors.newCachedThreadPool());
           service.renderProductDetail();
    }
}
