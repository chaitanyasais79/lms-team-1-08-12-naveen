package com.lms.service;

import java.util.List;

import com.lms.dto.AllCourseUsersDto;
import com.lms.dto.UserCoursesDto;
import com.lms.dto.VideoDto;
import com.lms.entity.CourseModules;
import com.lms.entity.CourseUsers;
import com.lms.entity.Courses;

public interface CourseService {

	boolean saveCourseUser(CourseUsers courseUsers);

	boolean saveCourses(Courses course);

	boolean accessCouresToUser(String courseUserEmail, String courseName, String trainerName);
	
	boolean addVideoLink(VideoDto videoDto);

	UserCoursesDto getCourseUsers(String courseUserName);

	List<AllCourseUsersDto> getCourses(String courseName, String trainerName);

	List<CourseModules> getVideoLink(String userEmail, String courseName, String trainerName);
}
