package com.example.restful;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:

                FriendsFragment friendsFragment= new FriendsFragment();
                return  friendsFragment;

            case 1:

                ChatsFragment chatsFragment= new ChatsFragment();
                return chatsFragment;

            case 2:


                RequestsFragment requestsFragment = new RequestsFragment();
                return requestsFragment;

                default:
                    return null;
        }




    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){

            case 0:
                return "ARKADAŞLAR";

            case 1:
                return "MESAJLAR";

            case  2:

                return "İSTEKLER";

             default:

                 return null;

        }



    }
}
