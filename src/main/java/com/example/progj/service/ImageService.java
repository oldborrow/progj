package com.example.progj.service;

import com.example.progj.model.Author;
import com.example.progj.model.Image;
import com.example.progj.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.persistence.criteria.Path;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

@Service
@RequiredArgsConstructor
public class ImageService {
//    private final ImageRepository imageRepository;
//
//    public Image addImage(MultipartFile file, Author author) throws IOException {
//        // Создаем директорию
//        File uploadDir = new File("/Users/lowtab/IdeaProjects/progj/src/main/resources/static");
//
//        String curDate = LocalDateTime.now().toString();
//        // Создаем уникальное название для файла и загружаем файл
//        String fileName =
//                "attach_" + curDate + "_" + file.getOriginalFilename().toLowerCase().replaceAll(" ", "-");
//        file.transferTo(new File(uploadDir + "/" + fileName));
//        //Image image = new Image(fileName, LocalDate.now()), ".img", "/attachments/get/" + Year.now() + "/" + fileName)
////        imageRepository.save(image);
////        return image;
//    }
//
//    public Image findAttachById(Long attachId) {
//        return imageRepository
//                .findById(attachId)
//        //        .orElseThrow(() -> new ImageNotFoundException("Image not found!"));
//    }
//
//    public Resource loadFileAsResource(String fileName)
//            throws MalformedURLException {
//        Path fileStorageLocation =
//                (Path) Paths.get("/Users/lowtab/IdeaProjects/progj/src/main/resources/static");
//        Path filePath = fileStorageLocation.resolve(fileName).normalize();
//        return new UrlResource(filePath.toUri());
//    }
}
