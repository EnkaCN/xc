package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;


public interface CourseBaseInfoService {
    public PageResult<CourseBase> queryCourseBaseList(PageParams params,
                                                      QueryCourseParamsDto queryCourseParamsDto);
}
