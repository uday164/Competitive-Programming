function colorGraph(graph, colors) {
  graph.forEach((node) => {

    if (node.neighbors.has(node)) {
      throw new Error('Loop detected!' + node.label);
    }



    var illegalColors = new Set();
    
    node.neighbors.forEach((neighbor) => {
      if (neighbor.color !== null) {
        illegalColors.add(neighbor.color);
      }
    });

    
    for (var i = 0; i < colors.length; i++) {
      var color = colors[i];

      if (!illegalColors.has(color)) {
        node.color = color;
        break;
      }
    }
  });
}
