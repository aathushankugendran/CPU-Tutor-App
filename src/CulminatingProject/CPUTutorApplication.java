package CulminatingProject;
/*
 * Name: Aathushan Kugendran
 * 
 * Date of Submission: Monday January 17, 2022
 * 
 * Course Code: ICS4U1-03
 * 
 * Instructor: Mr.Fernandes
 * 
 * Project Title: CPU Tutor App
 * 
 * Description: I have created a CPU Tutor App, this app essentialy is to educate the user
 * about a CPU and test the knowledge they have attained after learning about a CPU from the App.
 * 
 * Features: Certain features I had added to my App is a login screen and to login to the app you must create an account first.
 * The app will then check if the account details match to the account that was created to let the user proceed further into the app.
 * Another feature I added was a quiz at the end of learning about the CPU. This quiz would open up after you have navigated through all 
 * screens of the app, once the quiz is opened you can't go back to the previous screens. This was implemented because being able to go back
 * to the previous screens could result in possible cheating. On the quiz you have to complete the quiz and each unanswered question is considered 
 * incomplete resulting your score for that question as a zero. There are hint buttons for each question and after completing the quiz you would 
 * submit the quiz and recieve a score out of 8 marks. Once the quiz is completed you would close the app.
 * 
 * Major Skills: The skills that I implemented into my program was object oriented programming, retrieving data from text files and also working with making a friendly UI for the user.
 * 
 * Areas of Concern: An area of concern was trying to go back to the create account screen after coming back from the createaccount screen, this is because the 
 * screen would be a white screen and now show any JLabels, JButtons and many other componenets of the screen. Another area of concern I had 
 * was trying to end the application and run the app again and log in with the same login info I used from my previous login.
 * 
 */
public class CPUTutorApplication {

	public static void main(String[] args) {
		
		new Login();
	}
}
