package coms.CricApp.controllers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import coms.CricApp.entity.Cricket;
import coms.CricApp.service.CricService;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CricController {

	@Autowired
	CricService cs;
	
	@GetMapping("/showcric")
	public String ShowCricInfo(Model m)
	{
		m.addAttribute("cricketer", new Cricket());
		return "AddCric";
	}

	@PostMapping("/savecricketer")
	public String  AddCricketer(@ModelAttribute("cricketer")  Cricket ci, 
			@RequestParam MultipartFile upimage, Model m) throws IOException
	{
		String fname = upimage.getOriginalFilename();
	
		System.out.println(fname);
		
		byte[] bt = upimage.getBytes();
		
		ci.setCfilename(fname);
		ci.setCricphoto(bt);
		
		String st = cs.AddCricketer(ci);
		
		m.addAttribute("cricketer", new Cricket());
		m.addAttribute("msg", "File Uploaded...");
		return "AddCric";
	}
	
	@GetMapping("/getcricinfo")
	public String ViewAllCricketers(Model m)
	{
		List<Cricket> cricAll = cs.getAllCricketers();
		m.addAttribute("cricAll",cricAll);
		return "ViewCricInfo";
	}

	@GetMapping("/getCricPhoto/{id}")
	public void getStudentPhoto(HttpServletResponse response, @PathVariable("id") int id) throws Exception {
		response.setContentType("image/jpeg");

		Blob ph = cs.getPhotoById(id);

		byte[] bytes = ph.getBytes(1, (int) ph.length());
		
		InputStream inputStream = new ByteArrayInputStream(bytes);
		IOUtils.copy(inputStream, response.getOutputStream());
	}

}
