package com.example.android.studentsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Student.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        databaseHandler.addStudent(new Student("Radio engineering", "Petrov",
                "Ivan", 4.2));
        databaseHandler.addStudent(new Student("Biology", "Sokolova", "Elena",
                3.8));
        databaseHandler.addStudent(new Student("Aircraft", "Kruglov", "Mihail",
                4.7));
        databaseHandler.addStudent(new Student("Economy", "Yurkina", "Vlada",
                5.0));
        databaseHandler.addStudent(new Student("Physical Culture", "Bataev",
                "Aleksander", 4.1));

        List <Student> studentList = databaseHandler.getAllStudents();
        for (Student student : studentList) {
            Log.d("StudentInfo", "ID " + student.getId() + ", faculty " + student.getFaculty() +
                    ", surname " + student.getSurname() + ", name " + student.getName() +
                    ", average score " + student.getAverageScore());
        }
    }
}