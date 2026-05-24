package com.example.demo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer {
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@NotNull
		@Size(min = 3, message = "Customer name must have at least 3 characters")
		private String name;
		
		@Email(message = "Please enter valid email")
		@NotBlank(message = "Email cannot be blank")
		private String email;
		
		@NotBlank(message = "Age cannot be blank")
		private int age;
		
		@NotNull
		@Size(min = 10, max = 10, message = "Phone number must be 10 digits")
		private String phoneno;
		
		@NotBlank(message = "Address cannot be blank")
		private String address;

		
		public Customer() {
		}
		
		public Customer(@NotNull @Size(min = 3, message = "Customer name must have at least 3 characters") String name,
				@Email(message = "Please enter valid email") @NotBlank(message = "Email cannot be blank") String email,
				@NotBlank(message = "Age cannot be blank") int age,
				@NotNull @Size(min = 10, max = 10, message = "Phone number must be 10 digits") String phoneno,
				@NotBlank(message = "Address cannot be blank") String address) {
			super();
			this.name = name;
			this.email = email;
			this.age = age;
			this.phoneno = phoneno;
			this.address = address;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getPhoneno() {
			return phoneno;
		}

		public void setPhoneno(String phoneno) {
			this.phoneno = phoneno;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", phoneno="
					+ phoneno + ", address=" + address + "]";
		}
		
		

		
		
		
	}

