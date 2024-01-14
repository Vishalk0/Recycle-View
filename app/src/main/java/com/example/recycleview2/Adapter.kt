package com.example.recycleview2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview2.databinding.RvItemviewBinding
class Adapter(var dataList: List<Model>):RecyclerView.Adapter<Adapter.ViewHolder>(){
    inner class ViewHolder(var binding: RvItemviewBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val binding=RvItemviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.binding.img.setImageResource(dataList[position].img)
        holder.binding.text.text= dataList[position].name
    }
}


//class Adapter(var dataList:List<Model>): RecyclerView.Adapter<Adapter.MyViewHolder>() {
//
//
//
//
//inner class MyViewHolder(var binding:RvItemviewBinding):RecyclerView.ViewHolder(binding.root)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        var binding=RvItemviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
//        return MyViewHolder(binding)
//    }
//
//    override fun getItemCount(): Int {
//        return dataList.size
//    }
//
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.binding.img.setImageResource(position)
//
//    }


