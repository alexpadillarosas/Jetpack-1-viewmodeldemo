# Jetpack-1-viewmodeldemo
A Basic application showing Google recommending approach to build Android apps.
As first step we will have a look at viewmodel component (This app was builded using the Fragment + ViewModel template from  Android Studio).

By applying the "separation of concerns" principle, the data that is now kept in the view, stay in memory when you rotate the device. Whereas the Controller (Activity / Fragment) is recreated during the life cycle of an app.
The viewmodel used by an activity will remain in memory until the activity finishes, and as in a viewmodel app it will be until the app ends.

## This view model component can be represented in the following diagram:
![47261CDA-B81D-44C0-9D68-9E7A67AB4C3F](https://user-images.githubusercontent.com/4823319/69471806-c3b93700-0df7-11ea-843f-735afb49d8ae.jpg)

## Portrait of our app
![Screenshot_1574476450](https://user-images.githubusercontent.com/4823319/69471807-c3b93700-0df7-11ea-9f93-85913f6ac8ed.png)

## Landscape of our app (Notice that the data was not cleaned up when the device was rotated)
![Screenshot_1574476464](https://user-images.githubusercontent.com/4823319/69471808-c3b93700-0df7-11ea-8176-e65a5ade9755.png)

