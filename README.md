# FestPass 🎟️
### Campus Event Registration System — Mock Prototype

FestPass is a small Java command-line prototype for demonstrating a campus event registration workflow.

## Objective
Provide a simple central place to view campus events, register for available seats, and check event capacity.

## Features
- List sample campus events and venues
- Register for an event using its event ID
- Reduce available seat count during the running session
- Display an event and seat summary
- Include sample CSV event and registration data

## Tech Stack
- Java (JDK 17 or later)
- CSV sample data
- Git and GitHub

## Run locally
```bash
javac FestPass.java
java FestPass
```

## Project structure
```text
FestPass-Mock/
├── FestPass.java
├── README.md
└── demo-data/
    ├── events.csv
    └── registrations.csv
```

## Scope
This is a mock demonstration. The sample CSV files are reference data; the command-line prototype keeps seat changes in memory and does not yet persist registrations to those files. It is not the completed course assignment.
