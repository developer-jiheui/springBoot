package com.gdu.myapp2.mapper;

import java.util.List;
import java.util.Map;

import com.gdu.myapp2.dto.AttachDto;
import com.gdu.myapp2.dto.UploadDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface UploadMapper {
  int insertUpload(UploadDto upload);
  int insertAttach(AttachDto attach);
  int getUploadCount();
  List<UploadDto> getUploadList(Map<String, Object> map);
  UploadDto getUploadByNo(int uploadNo);
  List<AttachDto> getAttachList(int uploadNo);
  AttachDto getAttachByNo(int attachNo);
  int updateDownloadCount(int attachNo);
  int updateUpload(UploadDto upload);
  int deleteAttach(int attachNo);
  int deleteUpload(int uploadNo);
}
