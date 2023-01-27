package Controller;

import Model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getAllPosts(Model model)
    {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Mobile Phones");
        post1.setBody("Apple , Samsung, Nokia, Motorola");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Programming Languages");
        post2.setBody("Java, C, C++, PHP, Python");
        post2.setDate(new Date());


        posts.add(post1);
        posts.add(post2);

        model.addAttribute("posts",posts);

        return "index";
    }
}