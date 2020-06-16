# JavaPRO
A JavaFX Application for Java Programming course.

### Run the App
Clone this repository and open it in your favourite IDE. Set the JRE version to 11, set the main class to JavaFXQuiz and you're goood to go.

### Application components
The Application consists of four components:

#### 1. Quiz
The standard user can take a test of JavaFX or Java language. The superuser can additionaly create a test and add questions to it. Questions can include images or code fragments.
#### 2. Slide Viewer
Each user can view the loaded lectures. It is possible to autoPlay the lecture, every slide will be shown for 3 seconds. The user can navigate through the lecture using buttons (first, previous, next, last).
#### 3. Code Viewer
Each user can view the loaded projects. Projects contain source codes.
#### 4. Tools
This component consists of several categories of Java Tools, Tutorials and Documentation links which are opened in a built-in Web Browser.

### Account Management
Each user has his own private account which grants him access to specified resources (roles: student and admin). The App enables users to create an account or sign in, if they already have an account.

### Content format
All the contents of the App are stored in JSON files, so in the future it could get all the data from an API (this feature would be ready to implement thanks to the ReadJSONFile class).
