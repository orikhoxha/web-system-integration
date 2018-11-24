package com.websystemintegration.ecommerce.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface ItemImageService {

    void store(MultipartFile file);
    Resource loadFile(String fileName);

}
