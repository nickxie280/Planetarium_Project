# Sprint Retrospective

## What When Well:
- Implementing what we learned.
  - I found that the implementation of Cucumber and Selenium was very smooth! I found that there were not too many issues in regards to the syntax and programming aspect of the project.
- Understanding the fundamentals of testing.
  - Throughout the project I found it relatively simple to keep track of what needed to be covered testing wise, as well as understanding what we are looking for as testers.
- Adapting to a new programming environment.
  - With no prior experience with Java (prior to PEP and Cohort) and any of its automation/testing frameworks, I had thought that it would be an extremely challenging experience trying to learn everything at once. However I found that through my prior programming experiences from university, I was able to apply similar principles and coding practices to keep up with the newer material.

## What Needs To Be Improved Upon:
- Code Optimization and Organization.
  - Throughout the project, I had a hard time organizing functions properly resulting in many duplicate functions simply named different things that essentially do the same thing. This continuity issue is definitely something that needs to be improved upon for future projects.
- Note Leaving/Taking.
  - Generally I find that it's good programming practice to leave notes as you work just to keep a streamlined idea on what you're planning to do next as well as what has already been implemented. I found that throughout this project, I had lost track of what needed to be completed, not making fantastic use of Jira or other forms of documentation.
- Time Management.
  - I found that time was a big issue throughout the development process of the project. I greatly overestimated and underestimated the accurate timeframe required to complete certain sections of the project. This lead to rushed aspects in some parts and caused un-needed stress during implementation.

## What Still Needs To Be Accomplished:
- Implementing Hooks.
  - I hadn't implemented hooks throughout the project, only making use of it for resetting the database between tests. For the future, hooks should be implemented in a way where it covers testing specifically related to the "Requirements" section of testing. Making sure that all requirements have been fulfilled. As a temporary solution all test data had been implemented with requirements in mind, however implementing hooks would be a much more long term and practical solution.
- Owner Verification.
  - One of the checks that I had not implemented was for checking the ownership of planets and moons, I had noticed that near the end of testing development that the owner id for test user "Batman" had been mismatched being assigned "2" which should not be able to be seen by "Batman" if that was the case.