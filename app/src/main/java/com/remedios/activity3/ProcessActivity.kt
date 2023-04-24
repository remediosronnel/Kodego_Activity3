package com.remedios.activity3


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.remedios.activity3.databinding.ActivityProcessBinding

class ProcessActivity:AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<StudentData>
    lateinit var imageId : Array<Int>
    private lateinit var heading : Array<String>
    lateinit var courses : Array<String>
    private lateinit var binding: ActivityProcessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProcessBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "List of Students"

        imageId = arrayOf(
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5,
            R.drawable.img_6,
            R.drawable.img_7,
            R.drawable.img_8,
            R.drawable.img_9,
            R.drawable.img_10,
            R.drawable.img_11,
            R.drawable.img_12,
            R.drawable.img_13,
            R.drawable.img_14,
            R.drawable.img_15,
            R.drawable.img_16,
            R.drawable.img_17
            )

    heading = arrayOf(
        "Rhea Samontina",
        "Leo Kurakmo",
        "Reynaldo Martinez",
        "Reymark Ponce",
        "Harry Pothead",
        "Rico Yarn",
        "Chi Zu",
        "Abubkr Veruela",
        "Kaizer Semino",
        "Lilith Basilyo",
        "Jolekor Sandoval",
        "Randy Catubay",
        "Cam Bu Ai",
        "Belinda Braid",
        "Jonalyn Viray",
        "Miko Hernandez",
        "Harvey Dwight",
        "Cutie Pie"
    )
        courses = arrayOf(
            "BS Volcanizing major in English",
            "BS Wood Lamination and Lapida Engineering",
            "BS Cursing",
            "BS Metalurical Engineering",
            "BS Biology major in Human Anatomy",
            "BS Chismosa",
            "BS Molecular Biology",
            "BS Embalming major in Organ Transporting",
            "AB Normal major in Dentistry",
            "AB Arts",
            "BS Wood Lamination and Lapida Engineering",
            "BS Nursing",
            "BS Metalurical Engineering",
            "BS Biology major in Human Anatomy",
            "BS Chismosa",
            "BS Molecular Biology",
            "BS Embalming major in Organ Transporting"
        )
        newRecyclerView = binding.recyclerView
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<StudentData>()
        getUserData()
    }
    private fun getUserData(){
        for(i in imageId.indices){
            val students = StudentData(imageId[i], heading[i], courses[i])
            newArrayList.add(students)
        }
        newRecyclerView.adapter = StudentAdapter(newArrayList)
    }
}