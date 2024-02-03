# JPA Auditing

This is a simple project to demostrate one way to implement auditing in our entities.

## Key concepts:

The most common fields that we use when we are talking about auditing are:

- createdBy
- updateBy
- createdAt
- updatedAt

**AuditorAware** is an interface provided by Spring Data JPA that is used to dynamically determine the current auditor (user) for auditing purposes.

When you annotate an entity class with **@EntityListeners**, you can specify one or more listener classes that implement the corresponding JPA callback methods. These methods will be invoked automatically when the specified events occur on the entity, such as entity creation, update, or deletion.

To enable AuditorAware interface, we need to create a bean with the implementation and add the **@EnableJpaAuditing** annotation referencing the name of the bean method as you can see in the code.

**AuditingEntityListener.class** is a built-in entity listener class provided by Spring Data JPA for auditing purposes. It is used in conjunction with auditing annotations (@CreatedBy, @LastModifiedBy, @CreatedDate, @LastModifiedDate) to automatically populate auditing-related fields in entities.

## Technologies:

- Spring Boot
- Spring Data JPA
- Spring MVC
- Lombok
- Java 17 (coretto)
- H2 Database
- Gradle

Thank you for reading ❤️
Happy coding 🚀
