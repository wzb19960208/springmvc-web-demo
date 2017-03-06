package com.binbin.controller;



import com.binbin.model.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class FileUploadController {


    //上传的页面
    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String listUploadedFiles(Model model) throws IOException {

        return "uploadForm";
    }


    //上传的处理页面
    @RequestMapping(value = "/upload/img", method = RequestMethod.POST)
    @ResponseBody
    public Result handleFileUpload(@RequestParam("file") CommonsMultipartFile file) {


        //临时文件(绝对路径)
        File destFile = new File("/Users/weizhibin/Desktop/gs-uploading-files-master/upmTestDemo/upload-dir");

        //bugID文件夹
        if (!destFile.exists())
            destFile.mkdir();


        try {

            //用时间来命名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
            String dateString = formatter.format(currentTime);

            destFile = new File(destFile+"/"+dateString);


            if(!destFile.exists()) {
                destFile.createNewFile();
            }


            file.transferTo(destFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(destFile.getPath());
    }
}
