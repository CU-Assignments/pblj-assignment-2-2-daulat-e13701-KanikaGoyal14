 import java.io.*;
 class Student implements Serializable {
 private static final long serialVersionUID = 1L;
 private int id;
 private String name;
 private double gpa;
 public Student(int id, String name, double gpa)
 { this.id = id;
 this.name =name;
 this.gpa = gpa;
 }
 @Override
 public String toString() {
 return "Student{id=" + id + ", name='" + name + "', gpa=" + gpa + "}";
 }
 }
 public class StudentSerialization {
 private static final String FILE_NAME = "student.ser";
 public static void main(String[] args) {
 Student student = new Student(1, "Anwar", 7.8);
 serializeStudent(student);
 deserializeStudent();
 }
 public static void serializeStudent(Student student) {
 try (ObjectOutputStream oos =new ObjectOutputStream(new
 FileOutputStream(FILE_NAME))) {
 oos.writeObject(student);
 System.out.println("Student object serialized successfully.");
 } catch (FileNotFoundException e)
 { System.err.println("File not found: " + e.getMessage());
 } catch (IOException e) {
 System.err.println("IOException occurred: " + e.getMessage());
 }
 }
 public static void deserializeStudent() {
 try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME)))
 {
 Student student = (Student) ois.readObject();
 System.out.println("Deserialized Student: " + student);
 } catch (FileNotFoundException e)
 { System.err.println("File not found: " + e.getMessage());
 } catch (IOException e) {
 System.err.println("IOException occurred: " + e.getMessage());
 } catch (ClassNotFoundException e)
 {
 System.err.println("Class not found: " + e.getMessage());
 }
 }
 }
