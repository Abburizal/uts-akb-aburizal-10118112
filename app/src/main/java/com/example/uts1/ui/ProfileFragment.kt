package com.example.uts1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.uts1.R
import androidx.appcompat.app.AlertDialog

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val profileImageView: ImageView = view.findViewById(R.id.profile_image)
        val profileDescription: TextView = view.findViewById(R.id.profile_description)
        val contactButton: Button = view.findViewById(R.id.contact_button)
        val findMeButton: Button = view.findViewById(R.id.find_me_button)
        val aboutButton: Button = view.findViewById(R.id.about_button)

        profileImageView.setImageResource(R.drawable.ic_profile)
        profileDescription.text = "This is the profile description"

        contactButton.setOnClickListener {
            Toast.makeText(context, "Contact button clicked", Toast.LENGTH_SHORT).show()
            // Implement contact action here
        }

        findMeButton.setOnClickListener {
            Toast.makeText(context, "Find Me button clicked", Toast.LENGTH_SHORT).show()
            // Implement find me action here
        }

        aboutButton.setOnClickListener {
            // Show custom dialog about application version
            val dialogView = inflater.inflate(R.layout.dialog_about, container, false)
            val builder = AlertDialog.Builder(requireContext())
            builder.setView(dialogView)
                .setTitle("About")
                .setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }
            val dialog = builder.create()
            dialog.show()
        }

        return view
    }
}
