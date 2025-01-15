# Movie App

## Overview

The **Movie App** is an Android application built using Java and follows the MVVM architecture. It fetches movie data from **The Movie Database (TMDb) API** and displays a list of movies on the screen in a user-friendly interface.

This app demonstrates modern Android development practices, including clean architecture, separation of concerns, and API integration.

## Features

- Fetches and displays a list of movies from the TMDb API.
- Implements the **MVVM (Model-View-ViewModel)** architecture for clean and scalable code.
- Displays movie titles, posters, and additional information in a RecyclerView.
- Uses Retrofit for network requests and LiveData for observing data changes.
- Material Design components for an intuitive user interface.

## Screenshots

![main_screen](https://github.com/user-attachments/assets/92d471cc-ffe7-4875-821a-d5b745a5e5da)


## Tech Stack

- **Language**: Java
- **Architecture**: MVVM (Model-View-ViewModel)
- **Networking**: Retrofit
- **Data Binding**: LiveData
- **UI Components**: RecyclerView, Material Design
- **API**: The Movie Database (TMDb) API

## Requirements

- **Minimum Android Version**: API Level 21 (Lollipop)
- **Development Environment**: Android Studio
- **Dependencies**:
  - Retrofit: For network requests.
  - Gson: For parsing JSON data.
  - LiveData & ViewModel: For MVVM architecture.
  - Glide or Picasso: For loading images (optional, based on your implementation).

## Setup Instructions

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/MaddyRizvi/movie-app


## 5 .Build and Run the App

1. Build the project by selecting **Build > Make Project** in Android Studio.
2. Run the app by clicking the **Run** button or using the shortcut `Shift + F10`.
3. Test the app on an emulator or a physical device.

---

## 6. App Usage

1. Open the app to see a list of movies fetched from TMDb.
2. Scroll through the list to explore movie titles and posters.
3. (Optional) Tap on a movie item to view more details (e.g., description, release date, or ratings) if implemented.

---

## 7. Contributing

If you'd like to contribute to the Movie App, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Create a pull request with a description of the changes.

---

## 8. Acknowledgements

- **The Movie Database (TMDb) API**: For providing an extensive collection of movie data.
- **Retrofit**: For handling seamless API requests.
- **MVVM Architecture**: For maintaining a clean and scalable project structure.
- **Material Design**: For crafting a polished and modern user interface.
- **Android Studio**: For providing a robust development environment.


