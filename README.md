📌 Overview
This project is a Behavior-Driven Development (BDD) based API testing framework that automates RESTful API validation using Cucumber, RestAssured, and TestNG.
It allows writing human-readable test scenarios that are directly linked to executable Java code.

🧰 Tech Stack

Language: Java

Frameworks: Cucumber (BDD), TestNG

Library: RestAssured (for API testing)

Build Tool: Maven

Reporting: (Optional) TestNG default reports or Extent Reports

🧩 Key Features

Modular and reusable Step Definitions

Easy integration with Git or GitHubs or GitHub Actions.

Supports GET/POST/PUT/DELETE API methods

Data-driven testing using Cucumber DataTables

Validates status codes, response body, and JSON fields.

src
 └── test
     ├── java
     │   ├── com.api.runner              # TestNG Cucumber Runner
     │   └── com.api.stepdefnitions      # Step Definitions
     └── resources
         └── feature                     # Feature files (BDD Scenarios)

🧪 How to Run

Clone the repository

Open the project in Eclipse or IntelliJ

Run using TestNG:
Right-click on TestNGRunner.java → Run As → TestNG Test

