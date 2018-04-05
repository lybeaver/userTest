package user.course.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import user.course.dao.UserMapper;

@Service("userService")
@Transactional
public class StudentService {
  @Resource
  private UserMapper mapper;
  public Integer getCount() {
	  return mapper.getCount();
  }
}
