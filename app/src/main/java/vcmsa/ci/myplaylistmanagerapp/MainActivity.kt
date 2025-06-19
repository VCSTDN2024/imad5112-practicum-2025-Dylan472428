package vcmsa.ci.myplaylistmanagerapp
package com.dylan.musicplaylist

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.musicplaylist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding.i


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddSong.setOnClickListener { showInputDialog() }

        binding.btnViewDetails.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }

        binding.btnExit.setOnClickListener {
            finishAffinity() // closes the app
        }
    }

    private fun showInputDialog() {
        val dialogView = layoutInflater.inflate(R.layout.dialog_input_song, null)
        val songInput = dialogView.findViewById<EditText>(R.id.etSong)
        val artistInput = dialogView.findViewById<EditText>(R.id.etArtist)
        val ratingInput = dialogView.findViewById<EditText>(R.id.main)
        val commentInput = dialogView.findViewById<EditText>(R.id.main)

        AlertDialog.Builder(this)
            .setTitle("Enter Song Details")
            .setView(dialogView)
            .setPositiveButton("Add") { _: DialogInterface, _: Int ->
                val song = songInput.text.toString()
                val artist = artistInput.text.toString()
                val rating = ratingInput.text.toString().toIntOrNull()
                val comment = commentInput.text.toString()

                val playlistmanagerapp = null
                if (song.isNotBlank() && artist.isNotBlank() && rating != null && playlistmanagerapp.addSong(song, artist, rating, comment)) {
                    Toast.makeText(this, "Song added!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Invalid input. Please try again.", Toast.LENGTH_SHORT).show()
                }
            }
            .setNegativeButton("Cancel", null)
            .show()
    }
}
