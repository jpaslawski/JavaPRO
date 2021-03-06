package pl.jp;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javafx.scene.image.Image;
import pl.jp.models.*;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadJsonFile {

    private List<User> users;
    private List<Question> questions;
    private List<Quiz> quizzes;
    private List<QuizResult> quizResults;
    private List<Lecture> lectureList;
    private List<Project> projectList;
    private List<JavaTools> toolsList;

    public List<User> getUsers() {
        try {
            FileReader inputReader = new FileReader("files/userList.json");
            Type listType = new TypeToken<ArrayList<User>>(){}.getType();
            users = new Gson().fromJson(inputReader, listType);

            inputReader.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File does not exist");
        }
        catch (IOException e) {  System.err.println("An error occurred while writing to the file."); }

        return users;
    }

    public User getUser(String email) {
        List<User> userList = getUsers();
        for (User user : userList) {
            if(email.equals(user.getEmail())) {
                return user;
            }
        }
        return null;
    }

    public void addNewUser(List<User> users) {
        try {
            FileWriter writer = new FileWriter("files/userList.json");
            Gson gson = new Gson();
            gson.toJson(users, writer);
            writer.flush();
            writer.close();
        }
        catch (FileNotFoundException e) { System.err.println("File does not exist"); }
        catch (IOException e) {  System.err.println("An error occurred while writing to the file."); }
    }

    public List<Question> getQuestions(String fileName) {
        try {
            FileReader inputReader = new FileReader("files/" + fileName);
            Type listType = new TypeToken<ArrayList<Question>>(){}.getType();
            questions = new Gson().fromJson(inputReader, listType);
            inputReader.close();
        }
        catch (Exception e) {return null;}

        return questions;
    }

    public void addNewQuestion(List<Question> questions, String fileName) {
    try {
        FileWriter writer = new FileWriter("files/" + fileName);
        Gson gson = new Gson();
        gson.toJson(questions, writer);
        writer.flush();
        writer.close();
    }
    catch (FileNotFoundException e) { System.err.println("File does not exist"); }
    catch (IOException e) { e.printStackTrace(); }
    }

    public List<Quiz> getQuizzes() {
        try {
            FileReader inputReader = new FileReader("files/quizList.json");
            Type listType = new TypeToken<ArrayList<Quiz>>(){}.getType();
            quizzes = new Gson().fromJson(inputReader, listType);

            inputReader.close();
        }
        catch (FileNotFoundException e) { System.err.println("File does not exist"); }
        catch (IOException e) {  System.err.println("An error occurred while writing to the file."); }

        return quizzes;
    }

    public void addNewQuiz(List<Quiz> quizzes) {
        try {
            FileWriter writer = new FileWriter("files/quizList.json");
            Gson gson = new Gson();
            gson.toJson(quizzes, writer);
            writer.flush();
            writer.close();
        }
        catch (FileNotFoundException e) { System.err.println("File does not exist"); }
        catch (IOException e) {  System.err.println("An error occurred while writing to the file."); }
    }

    public List<QuizResult> getUserResults(String email) {
        try {
            FileReader reader = new FileReader("files/" + email + ".json");
            Type listType = new TypeToken<ArrayList<QuizResult>>(){}.getType();
            quizResults = new Gson().fromJson(reader, listType);

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("There is no file with the given name! Creating file....");
            File file = new File(email + ".json");
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("Unable to create new file");
            }
            try {
                FileOutputStream oFile = new FileOutputStream(file, false);
                return null;
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return quizResults;
    }

    public void saveResults(QuizResult quizResult, String email) {
        List<QuizResult> quizResults = getUserResults(email);
        if (quizResults == null) {
            List<QuizResult> newList = new LinkedList<QuizResult>();
            newList.add(quizResult);
            try {
                FileWriter writer = new FileWriter("files/" + email + ".json");
                new Gson().toJson(newList, writer);
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.err.println("Unable to save results!");
            }
        } else {
            quizResults.add(quizResult);
            try {
                FileWriter writer = new FileWriter("files/" + email + ".json");
                new Gson().toJson(quizResults, writer);
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.err.println("Unable to save results!");
            }
        }
    }

    public List<Lecture> getLectureList() {
        try {
            FileReader inputReader = new FileReader("files/lectureList.json");
            Type listType = new TypeToken<ArrayList<Lecture>>(){}.getType();
            lectureList = new Gson().fromJson(inputReader, listType);

            inputReader.close();
        }
        catch (FileNotFoundException e) { System.err.println("File does not exist"); }
        catch (IOException e) {  System.err.println("An error occurred while reading to the file."); }

        return lectureList;
    }

    public Image getSlide(String folderName, String slideName) {
        return new Image(new File("files/" + folderName + "/" + slideName).toURI().toString());
    }

    public List<Project> getProjectList() {
        try {
            FileReader inputReader = new FileReader("files/codeList.json");
            Type listType = new TypeToken<ArrayList<Project>>(){}.getType();
            projectList = new Gson().fromJson(inputReader, listType);

            inputReader.close();
        }
        catch (FileNotFoundException e) { System.err.println("File does not exist"); }
        catch (IOException e) {  System.err.println("An error occurred while reading to the file."); }

        return projectList;
    }

    public List<JavaTools> getToolsList() {
        try {
            FileReader inputReader = new FileReader("files/toolsList.json");
            Type listType = new TypeToken<ArrayList<JavaTools>>(){}.getType();
            toolsList = new Gson().fromJson(inputReader, listType);

            inputReader.close();
        }
        catch (FileNotFoundException e) { System.err.println("File does not exist"); }
        catch (IOException e) {  System.err.println("An error occurred while reading to the file."); }

        return toolsList;
    }
}
