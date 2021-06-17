package com.github.alexdyuba.mavendemo;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;

import java.awt.image.BufferedImage;

public class ImageComparator {
    public boolean isTheSameImages(BufferedImage image1, BufferedImage image2) {
        //Create ImageComparison object
        ImageComparison imageComparison = new ImageComparison(image1, image2);

        //Compare images
        ImageComparisonResult imageComparisonResult = imageComparison.compareImages();

        //Check, that ImageComparisonState is MATCH:
        return ImageComparisonState.MATCH == imageComparisonResult.getImageComparisonState();
    }
}
