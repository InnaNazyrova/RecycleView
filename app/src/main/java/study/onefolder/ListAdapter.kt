package study.onefolder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val listLists: List< String> ) : RecyclerView.Adapter<ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_list_item,parent,false )
        return ListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        val list = listLists [position]
        holder.bind(list)
    }

    override fun getItemCount(): Int {
        return listLists.size
    }
}