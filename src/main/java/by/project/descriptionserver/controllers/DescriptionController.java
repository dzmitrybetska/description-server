package by.project.descriptionserver.controllers;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

@RestController
@RequestMapping("/")
public class DescriptionController {

    @GetMapping
    public String readFile(@RequestParam String roomCategory) throws IOException {
        return new String(Files.readAllBytes(getFile(roomCategory).toPath()));
    }

    private File getFile(String roomCategory) throws FileNotFoundException {
        String filePath = "classpath:files/" + roomCategory.toLowerCase() + ".txt";
        return ResourceUtils.getFile(filePath);
    }
}
