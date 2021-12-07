package study.onefolder

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ListViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind (list: String){
        val listTextView :TextView=itemView.findViewById(R.id.name_text_view)

        listTextView.text= "Город - ${list}"
        itemView.setOnClickListener{
            Toast.makeText(itemView.context,list,Toast.LENGTH_LONG).show()

        }
    }
}