//
//  DetailViewController.h
//  GitBackToWork
//
//  Created by Roberto on 9/7/13.
//  Copyright (c) 2013 Roberto. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface DetailViewController : UIViewController <UISplitViewControllerDelegate>

@property (strong, nonatomic) id detailItem;

@property (weak, nonatomic) IBOutlet UILabel *detailDescriptionLabel;
@end
