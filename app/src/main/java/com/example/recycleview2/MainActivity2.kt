package com.example.recycleview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var dataList=ArrayList<Model>()
        for (i in 1..10){
            dataList.add(Model(R.drawable.human,"Vishal"))
            dataList.add(Model(R.drawable.human,"Vishal"))
            dataList.add(Model(R.drawable.human,"Vishal"))
            dataList.add(Model(R.drawable.human,"Vishal"))
            dataList.add(Model(R.drawable.human,"Vishal"))
            dataList.add(Model(R.drawable.human,"Vishal"))

        }

        var adapter=Adapter(dataList)
        binding.rv.layoutManager=LinearLayoutManager(this)
        binding.rv.adapter=adapter
    }
}