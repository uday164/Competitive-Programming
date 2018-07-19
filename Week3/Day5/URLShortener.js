function shortLink(request) {
  if (request.method !== 'POST') {
    return response(501); 
    
  }

  var destination = request.data.destination;
  var slug = request.data.slug;
  
  if (typeof slug === 'undefined') {
    slug = generateRandomSlug();
  }

  DB.insertLink(slug, destination);

  var responseBody = JSON.stringify({'slug': slug});
  return response(200, responseBody);
}
