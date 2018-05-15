package com.example.Auth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
    public class Register {
       @Id
       @GeneratedValue(strategy=GenerationType.IDENTITY)
       private long id;
        
       @Column
        private String name;
        @Column
        private String email;
        @Column
        private String password ;
        @Column
        private String cpass;
       /**
        * @return the id
        */
       public long getId() {
           return id;
       }
       /**
        * @param id the id to set
        */
       public void setId(long id) {
           this.id = id;
       }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
       /**
        * @param name the name to set
        */
       public void setName(String name) {
           this.name = name;
       }
    
        /**
         * @return the email
         */
        public String getEmail() {
            return email;
        }
   /**
    * @param email the email to set
    */
   public void setEmail(String email) {
       this.email = email;
   }
   /**
    * @return the password
    */
   public String getPassword() {
       return password;
   }
   /**
    * @param password the password to set
    */
   public void setPassword(String password) {
       this.password = password;
   }
   /**
    * @return the cpass
    */
   public String getCpass() {
       return cpass;
   }
   /**
    * @param cpass the cpass to set
    */
   public void setCpass(String cpass) {
       this.cpass = cpass;
   }
    }