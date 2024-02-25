# myADHDScheduler_API
***
## Preliminary QnA
**Q: What is the purpose of this API?** \
**A:** To help the user keep a better daily/weekly/monthly/yearly schedule, create important events/tasks/reminders, organize & prioritize issues/tasks over others, and more. Provide a "one-stop-shop" for time management with extensive personalization options \
\
**Q: What technologies are being used in this API?** \
**A:** Built on Java 17 using Springboot, Spring Data JPA, Spring Web, Spring Security, and more related dependencies that I can't think of atm
***
## Application Features
### Feature Brainstorm:
- The user should be able to create, edit, and delete...
  - **EVENTS:** An event occurs during a specified period of time, indicating the user will/won't be busy during that time
  - **TASKS:** A task is a single-case event that can be checked off at any time
- The user should be able to prioritize tasks
- The user should be able to filter events and tasks based on priority, category, & date/time