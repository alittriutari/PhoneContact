package com.alittriutari.phonecontact;

import java.util.ArrayList;
import java.util.Collections;

public class ContactData {
    public static String[][] data = new String[][]{
            {"Adrian", "087860233144", "https://images.pexels.com/photos/2085650/pexels-photo-2085650.jpeg?cs=srgb&dl=adult-attractive-blur-2085650.jpg&fm=jpg"},
            {"Agatha", "0857375229100", "https://images.unsplash.com/photo-1476493279419-b785d41e38d8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80"},
            {"Amanda", "081999344288", "https://images.unsplash.com/photo-1549057491-2ad8b74c6924?ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80"},
            {"Edward", "087860192889", "https://images.pexels.com/photos/1844547/pexels-photo-1844547.jpeg?cs=srgb&dl=face-facial-expression-fine-looking-1844547.jpg&fm=jpg"},
            {"George", "085737455011", "https://images.pexels.com/photos/2128819/pexels-photo-2128819.jpeg?cs=srgb&dl=face-man-model-2128819.jpg&fm=jpg"},
            {"Gordon", "085123617899", "https://images.pexels.com/photos/2379005/pexels-photo-2379005.jpeg?cs=srgb&dl=casual-close-up-colors-2379005.jpg&fm=jpg"},
            {"Jake", "081999102344", "https://images.pexels.com/photos/2117283/pexels-photo-2117283.jpeg?cs=srgb&dl=casual-eyeglasses-eyewear-2117283.jpg&fm=jpg"},
            {"Mary", "081999766890", "https://images.pexels.com/photos/2100063/pexels-photo-2100063.jpeg?cs=srgb&dl=beautiful-beauty-brunette-2100063.jpg&fm=jpg"},
            {"Rose", "087860899716", "https://images.pexels.com/photos/1082962/pexels-photo-1082962.jpeg?cs=srgb&dl=attractive-beautiful-casual-1082962.jpg&fm=jpg"},
            {"Samantha", "081390765666", "https://images.unsplash.com/photo-1510227272981-87123e259b17?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=633&q=80"},
    };


    public static ArrayList<ContactModel> getListData() {
        ArrayList<ContactModel> list = new ArrayList<>();
        for (String[] aData : data) {
            ContactModel contact = new ContactModel();
            contact.setName(aData[0]);
            contact.setNumber(aData[1]);
            contact.setImage(aData[2]);
            list.add(contact);
        }
        return list;
    }
}
