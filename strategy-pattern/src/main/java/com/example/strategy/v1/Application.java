package com.example.strategy.v1;

public class Application {

    public static void main(String[] args) {

        System.out.println("-----------Storing Image File with JPEG Compressor and B&W Filter--------");
        ImageStorageContext imageStorageContext = new ImageStorageContext(
                new JpegCompressorConcreteStrategy(), new BlackAndWhiteFilterConcreteStrategy());
        imageStorageContext.store("SampleFile1");

        System.out.println("\n-----------Storing Image File with PNG Compressor and Grayscale Filter--------");
        ImageStorageContext imageStorageContext2 = new ImageStorageContext(
                new PngCompressorConcreteStrategy(), new GrayscaleFilterConcreteStrategy());
        imageStorageContext2.store("SampleFile2");
    }
}
