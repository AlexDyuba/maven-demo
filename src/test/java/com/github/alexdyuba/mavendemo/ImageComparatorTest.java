package com.github.alexdyuba.mavendemo;

import com.github.romankh3.image.comparison.ImageComparisonUtil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.awt.image.BufferedImage;

@DisplayName("Unit-level testing for ImageComparator")
class ImageComparatorTest {

    private final ImageComparator comparator = new ImageComparator();

    @Test
    public void shouldConfirmImagesNotTheSame() {
        //given
        BufferedImage image1 = ImageComparisonUtil.readImageFromResources("photo-1.jpg");
        BufferedImage image2 = ImageComparisonUtil.readImageFromResources("photo-2.jpg");

        //when
        boolean theSameImages = comparator.isTheSameImages(image1, image2);

        //then
        Assertions.assertFalse(theSameImages);
    }

    @Test
    public void shouldConfirmImagesTheSame() {
        //given
        BufferedImage image1 = ImageComparisonUtil.readImageFromResources("photo-1.jpg");

        //when
        boolean theSameImages = comparator.isTheSameImages(image1, image1);

        //then
        Assertions.assertTrue(theSameImages);
    }
}