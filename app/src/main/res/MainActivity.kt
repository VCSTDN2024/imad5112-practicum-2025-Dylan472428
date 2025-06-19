package com.dylan.musicapp
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:padding="24dp">

<Button
android:id="@+id/btnAddSong"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:text="Add to Playlist"
app:layout_constraintTop_toTopOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"/>

<Button
android:id="@+id/btnViewDetails"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:text="View Playlist"
app:layout_constraintTop_toBottomOf="@id/btnAddSong"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_marginTop="16dp"/>

<Button
android:id="@+id/btnExit"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:text="Exit"
app:layout_constraintTop_toBottomOf="@id/btnViewDetails"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_marginTop="16dp"/>
</androidx.constraintlayout.widget.ConstraintLayout>
