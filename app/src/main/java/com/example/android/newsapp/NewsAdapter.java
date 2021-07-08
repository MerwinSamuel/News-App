package com.example.android.newsapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleView = (TextView) listItemView.findViewById(R.id.webTitle);
        titleView.setText(currentNews.getWebTitle());

        TextView sectionView= (TextView) listItemView.findViewById(R.id.sectionName);
        sectionView.setText(currentNews.getSectionName());

        TextView authorView=(TextView)listItemView.findViewById(R.id.authorName);
        authorView.setText(currentNews.getAuthor());

        TextView dateView= (TextView) listItemView.findViewById(R.id.webPublicationDate);
        String date2=currentNews.getWebPublicationDate();

        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy h:mm a");
        Date date = null;
        try {
            date = inputFormat.parse(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String formattedDate = outputFormat.format(date);
        dateView.setText(formattedDate);
        return listItemView;

    }


}
