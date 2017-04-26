package pk.edu.nust.seecs.gradebook.Bo;


import pk.edu.nust.seecs.gradebook.dao.*;
import pk.edu.nust.seecs.gradebook.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Shoaib
 */
public class bo {
    
private CloDao cloDao;
    private ContentDao contentDao;
    private CourseDao courseDao;
    private GradeDao gradeDao;
    private StudentDao studentDao;
    private TeacherDao teacherDao;
    
    private Map<Integer, Course> courseMap = new HashMap<>();
    private Map<Integer, Teacher> teacherMap = new HashMap<>();
    private Map<Integer, Student> studentMap = new HashMap<>();

    public CloDao getCloDao() {
        return cloDao;
    }

    public void setCloDao(CloDao cloDao) {
        this.cloDao = cloDao;
    }

    public ContentDao getContentDao() {
        return contentDao;
    }

    public void setContentDao(ContentDao contentDao) {
        this.contentDao = contentDao;
    }

    public CourseDao getCourseDao() {
        return courseDao;
    }

    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public GradeDao getGradeDao() {
        return gradeDao;
    }

    public void setGradeDao(GradeDao gradeDao) {
        this.gradeDao = gradeDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public TeacherDao getTeacherDao() {
        return teacherDao;
    }

    public void setTeacherDao(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public Map<Integer, Course> getCourseMap() {
        return courseMap;
    }

    public void setCourseMap(Map<Integer, Course> courseMap) {
        this.courseMap = courseMap;
    }

    public Map<Integer, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<Integer, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public Map<Integer, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<Integer, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public int addCourse(String title, int credits) {
        Course course = new Course();
        course.setClasstitle(title);
        course.setCreditHours(credits);
        course.setContents(new HashSet<Content>());
        course.setStudents(new HashSet<Student>());
        courseMap.put(courseMap.size(), course);
        return courseMap.size() - 1;
    }

    public void addCourseContent(int courseId, String title, String description) {
        Course course = courseMap.get(courseId);

        Content content = new Content();
        content.setTitle(title);
        content.setDescription(description);
        content.setClo(new ArrayList<Clo>());
        content.setCourse(course);

        course.getContents().add(content);
    }

    public void setCourseTeacher(int courseId, int teacherId) {
        Course course = courseMap.get(courseId);
        Teacher teacher = teacherMap.get(teacherId);

        teacher.getCourses().add(course);
        course.setTeacher(teacher);
    }

    public int setCourseTeacher(int courseId, String tname) {
        Course course = courseMap.get(courseId);

        Teacher teacher = new Teacher();
        teacher.setName(tname);
        teacher.setCourses(new HashSet<Course>());
        teacher.getCourses().add(course);
        course.setTeacher(teacher);

        teacherMap.put(teacherMap.size(), teacher);
        return teacherMap.size() - 1;
    }

    public void setCourseStudent(int courseId, int studentId) {
        Course course = courseMap.get(courseId);
        Student student = studentMap.get(studentId);

        student.getCourses().add(course);
        course.getStudents().add(student);
    }

    public int setCourseStudent(int courseId, String sname) {
        Course course = courseMap.get(courseId);

        Student student = new Student();
        student.setName(sname);
        student.setCourses(new HashSet<Course>());
        student.getCourses().add(course);

        course.getStudents().add(student);

        studentMap.put(studentMap.size(), student);
        return studentMap.size() - 1;
    }

    public Student getStudent(int id) {
        return studentMap.get(id);
    }

    public Teacher getTeacher(int id) {
        return teacherMap.get(id);
    }

    public Course getCourse(int id) {
        return courseMap.get(id);
    }

    public void update() {
        for (Course course : courseMap.values()) {
            courseDao.addCourse(course);
        }
    }
}
