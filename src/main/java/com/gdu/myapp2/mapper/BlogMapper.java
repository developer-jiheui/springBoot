package com.gdu.myapp2.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gdu.myapp2.dto.BlogDto;
import com.gdu.myapp2.dto.CommentDto;
import com.gdu.myapp2.dto.BlogImageDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface BlogMapper {
  int insertBlog(BlogDto blog);
  int insertBlogImage(BlogImageDto blogImage);
  int getBlogCount();
  List<BlogDto> getBlogList(Map<String, Object> map);
  int updateHit(int blogNo);
  BlogDto getBlogByNo(int blogNo);
  int updateBlog(BlogDto blog);
  List<BlogImageDto> getBlogImageList(int blogNo);
  int deleteBlogImage(String filesystemName);
  int deleteBlogImageList(int blogNo);
  int deleteBlog(int blogNo);
  List<BlogImageDto> getBlogImageInYesterday();
  
  int insertComment(CommentDto comment);
  int getCommentCount(int blogNo);
  List<CommentDto> getCommentList(Map<String, Object> map);
  int insertReply(CommentDto comment);
  int deleteComment(int commentNo);
}
