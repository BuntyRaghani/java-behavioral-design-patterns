package com.example.strategy.v2;

public class Application {

    public static void main(String[] args) {

        /* Here we are passing the compressor and filter to the store method
         * which gives us the flexibility to apply different types of compression algorithms
         * and filters to the same image
         */
        System.out.println("-----------Storing Image File with JPEG Compressor and B&W Filter--------");
        ImageStorageContext imageStorageContext = new ImageStorageContext();
        imageStorageContext.store("SampleFile1",
                new JpegCompressorConcreteStrategy(), new BlackAndWhiteFilterConcreteStrategy());

        // We are reusing the same ImageStorageContext object by applying the different compression algorithms and filters
        System.out.println("\n-----------Storing Image File with PNG Compressor and Grayscale Filter--------");
        imageStorageContext.store("SampleFile1",
                new PngCompressorConcreteStrategy(), new GrayscaleFilterConcreteStrategy());

        // Now, we have two versions of same file, one is saved as JPEG and other is saved as PNG
    }
}
