package com.bol.test.assignment.image;

import java.util.List;

public interface ImageService {

    /**
     * Returns a list of images for a given criteria and filter
     *
     * @param sortCriteria criteria used for the images
     * @param filterCriteria filter used for the images
     * @return list of images
     */
    List<Image> getImagesBy(SortCriteria sortCriteria, FilterCriteria filterCriteria);
}
