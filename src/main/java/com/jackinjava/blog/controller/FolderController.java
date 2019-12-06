package com.jackinjava.blog.controller;

import com.jackinjava.blog.commons.controller.BaseController;
import com.jackinjava.blog.mapper.FolderMapper;
import com.jackinjava.blog.model.Folder;
import com.jackinjava.blog.service.FolderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiJie
 * @date 2019/12/6 12:19
 */
@RestController
@RequestMapping("/folder")
public class FolderController extends BaseController<Folder, FolderMapper, FolderService> {

}
