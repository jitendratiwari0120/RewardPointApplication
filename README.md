# RewardPointApplication
A Spring Boot Web Restful Service for a reward point application

A Reward Point Service made with a Spring boot application
1.	Create two services to show the customer’s reward point and purchase reward point report.
2.	Technologies used: Spring boot, JDK 17, Spring Data JPA, H2, Junit 5.
3.	Create two tables: customer(id, name, rewardsPoint), 	Purchase (id, customerId, amount, purchaseDate)
4.	To start, run mvn spring-boot:run
5.	Verify the server log to confirm with the following message:
6.	 .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.4.2)

2025-02-19T07:58:23.971+05:30  INFO 19036 --- [RewardPoint] [           main] rewardPoint.RewardPointApplication       : Starting RewardPointApplication using Java 17.0.12 with PID 19036 (C:\Users\Hp\git\repository\RewardPoint\target\classes started by Hp in C:\Users\Hp\git\repository\RewardPoint)
2025-02-19T07:58:23.979+05:30  INFO 19036 --- [RewardPoint] [           main] rewardPoint.RewardPointApplication       : No active profile set, falling back to 1 default profile: "default"
2025-02-19T07:58:25.506+05:30  INFO 19036 --- [RewardPoint] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-02-19T07:58:25.634+05:30  INFO 19036 --- [RewardPoint] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 106 ms. Found 2 JPA repository interfaces.
2025-02-19T07:58:26.791+05:30  INFO 19036 --- [RewardPoint] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-02-19T07:58:26.821+05:30  INFO 19036 --- [RewardPoint] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-02-19T07:58:26.822+05:30  INFO 19036 --- [RewardPoint] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.34]
2025-02-19T07:58:26.972+05:30  INFO 19036 --- [RewardPoint] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-02-19T07:58:26.977+05:30  INFO 19036 --- [RewardPoint] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2864 ms
2025-02-19T07:58:27.226+05:30  INFO 19036 --- [RewardPoint] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-02-19T07:58:27.631+05:30  INFO 19036 --- [RewardPoint] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:dcbapp user=SA
2025-02-19T07:58:27.637+05:30  INFO 19036 --- [RewardPoint] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-02-19T07:58:27.782+05:30  INFO 19036 --- [RewardPoint] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2025-02-19T07:58:27.919+05:30  INFO 19036 --- [RewardPoint] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.5.Final
2025-02-19T07:58:27.992+05:30  INFO 19036 --- [RewardPoint] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2025-02-19T07:58:28.599+05:30  INFO 19036 --- [RewardPoint] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2025-02-19T07:58:28.775+05:30  WARN 19036 --- [RewardPoint] [           main] org.hibernate.orm.deprecation            : HHH90000025: H2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2025-02-19T07:58:28.814+05:30  INFO 19036 --- [RewardPoint] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
Application tested.
