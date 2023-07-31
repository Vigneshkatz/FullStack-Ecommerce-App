# Release 1.0

## Annotations Used

- `@Configuration`: Indicates that the class is a Spring configuration class. It is used to define beans and configure various aspects of the Spring application context.

- `@Entity`: Indicates that the class is a JPA (Java Persistence API) entity. It is used to map the class to a database table.

- `@Table`: Specifies the name of the database table to which the entity is mapped.

- `@Data`: A Lombok annotation that automatically generates getter and setter methods, toString, equals, and hashCode methods for the class.

- `@Getter` and `@Setter`: Lombok annotations to automatically generate getter and setter methods for the class properties.

- `@Column`: Specifies the mapping of the annotated attribute to a column in the database table.

- `@GeneratedValue`: Specifies the strategy for generating values of the annotated field, typically used with primary key fields.

- `@Id`: Specifies the primary key property of an entity.

- `@CrossOrigin`: Enables Cross-Origin Resource Sharing (CORS) for web service endpoints, allowing requests from different domains.

- `@RepositoryRestResource`: Exposes Spring Data REST endpoints for the annotated entity, allowing easy access to CRUD operations over HTTP.

- `@OneToMany`: Specifies a one-to-many relationship between entities. Used to define a collection of related entities on the owning side.

- `@ManyToOne`: Specifies a many-to-one relationship between entities. Used to define the owning side of a relationship.