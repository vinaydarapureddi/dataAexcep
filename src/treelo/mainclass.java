package treelo;

import java.sql.SQLException;

import javax.security.auth.login.CredentialExpiredException;

import epitree.exception.failedexce;
import treelo.dao.dataepitrees;


public class mainclass {

	public static void main(String[] args) throws CredentialExpiredException, ClassNotFoundException, SQLException {
 {

				dataepitrees dataserverice = dataepitrees.getInstance();

				System.out.println(dataserverice.addUser("Thomas")); // addUser(string username)
				System.out.println(dataserverice.addUser("AmirAli"));
				System.out.println(dataserverice.addUser("Rabih"));

				System.out.println(dataserverice.addList("Code")); // addList(string name)
				System.out.println(dataserverice.addList("Description"));
				System.out.println(dataserverice.addList("Misc"));

				System.out.println(dataserverice.addTask("Code", "Do Everything", 12, 1, "Write the whole code"));
				/*
				 * addTask(string list, string name, unsigned int estimatedTime, unsigned int
				 * priority, string description)
				 */
				System.out.println(dataserverice.editTask("Do Everything", 12, 10, "Write the whole code"));
				/*
				 * editTask(string task, unsigned int estimatedTime, unsigned int priority,
				 * string description)
				 */
				System.out.println( dataserverice.assignTask("Do Everything", "Rabih") ); // assignTask(string task, string user)
			    System.out.println( dataserverice.printTask("Do Everything") ); // printTask(string task)1
			    System.out.println( dataserverice.addTask("Code", "Destroy code formatting", 1, 2, "Rewrite the whole code in a worse format") );
			    System.out.println( dataserverice.assignTask("Destroy code formatting", "Thomas") );
			    System.out.println( dataserverice.addTask("Description", "Write Description", 3, 1, "Write the damn description") );
			    System.out.println( dataserverice.assignTask("Write Description", "AmirAli") );
			    System.out.println( dataserverice.addTask("Misc", "Upload Assignment", 1, 1, "Upload it") );
			    System.out.println( dataserverice.completeTask("Do Everything") ); // completeTask(string task)
			    System.out.println( dataserverice.printUsersByPerformance() );
			    System.out.println( dataserverice.printUsersByWorkload() );
			    System.out.println( dataserverice.printUnassignedTasksByPriority());
			    System.out.println( dataserverice.deleteTask("Upload Assignment") ); // deleteTask(string task)
			    System.out.println( dataserverice.printAllUnfinishedTasksByPriority("allUnfinishedTasks") );
			    System.out.println( dataserverice.addTask("Misc", "Have fun", 10, 2, "Just do it") );
			    System.out.println( dataserverice.moveTask("Have fun", "Code") ); // moveTask(string task, string list)
			    System.out.println( dataserverice.printTask("Have fun") );
			    System.out.println( dataserverice.printList("Code") ); // printList(string list)
			    System.out.println( dataserverice.printAllLists() );
			    System.out.println( dataserverice.printUserTasks("AmirAli") ); // printUserTasks(string user)
			    System.out.println( dataserverice.printUnassignedTasksByPriority() );
			    System.out.println( dataserverice.printAllUnfinishedTasksByPriority() );

	}

}
}
