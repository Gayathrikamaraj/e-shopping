$(function()
	//solving the active menu
		{
	switch(menu){
	case 'About Us':
		$('#about').addClass('active');break;
	case 'Contact Us':
		$('#contact').addClass('active');break;
	case 'All Prodcts':
		$('#listProducts').addClass('active');break;
		
		default:
			if(menu =="Home")break;
			$('#listProducts').addClass('active');break;
			$('#a_'+menu).addClass('active');break;
	}
	
		});