package dev.snowdrop.buildpack;

import java.io.File;

public class JavaTestExample {

    public static String APP_DIR = "/home/tati/Documents/localgit/gsoc/samples/apps/java-maven";
    public static String FINAL_IMAGE_NAME = "snowdrop/java-apptwo:test";
    public static String BUILD_IMAGE_NAME = "cnbs/sample-builder:alpine";

    public static void main(String[] args) throws Exception {
        BuildpackBuilder.get()
                .withContent(new File(APP_DIR))
                .withBuildImage(BUILD_IMAGE_NAME)
                .withFinalImage(FINAL_IMAGE_NAME)
                .build();
    }
}