# lrnr2
lrnr but with all the things we've learned as professional

# Goals for project improvements
1. Improve implementation generally
2. Use a production ready database (postgres)
3. Use database migrations (flyway)
4. Include unit test suites
5. Include IT suits
6. Use gradle instead of maven
7. Containerize the application (Docker)
8. Use a robust front-end framework (React)
9. Sign commits with GPG

# Running lrnr2
1. Navigate to the docker folder. Run 'docker compose up -d'.
This will start the database on port 5432.
Note: this may not work on Mac machines using the ARM chips.
2. Navigate to the backend folder. Run 'gradle bootRun'. This will run the backend service.