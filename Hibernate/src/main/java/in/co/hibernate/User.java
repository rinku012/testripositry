package in.co.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "USER")

public class User {
		

		@Id
		@GeneratedValue(generator="increment")
		@GenericGenerator(name="increment", strategy = "increment")
		@Column(name = "ID")
		private int id;

		@Column(name = "FIRST_NAME")
		private String firstName;
		
		@Column(name = "LAST_NAME")
		private String lastName;
		
		@Column(name = "USER_NAME")
		private String userName;
		
		@Column(name = "PASSWORD")
		private String password;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	}

